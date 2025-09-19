package dev.cuervolu.cortex.users.domain;

import jakarta.persistence.*;
import java.security.Principal;
import java.time.Instant;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "users", indexes = {
    @Index(name = "idx_user_username", columnList = "username", unique = true),
    @Index(name = "idx_user_email", columnList = "email", unique = true),
    @Index(name = "idx_user_provider", columnList = "provider, providerId", unique = true),
    @Index(name = "idx_user_enabled_status", columnList = "isEnabled")
})
public class User implements UserDetails, Principal {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Column(nullable = false, unique = true)
  private String username;

  @Column(nullable = false, unique = true)
  private String email;

  @Column(nullable = false)
  private String displayName;

  private String avatarUrl;

  private String password;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private AuthProvider provider;

  private String providerId;

  @Column(nullable = false)
  private Instant createdAt = Instant.now();

  private Instant updatedAt;

  @Column(nullable = false)
  private boolean isEnabled = false;

  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(
      name = "user_roles",
      joinColumns = @JoinColumn(name = "user_id"),
      inverseJoinColumns = @JoinColumn(name = "role_id")
  )
  private Set<Role> roles;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private SubscriptionTier subscriptionTier = SubscriptionTier.FREE;

  private Instant subscriptionEndDate;

  public User() {
  }

  private User(UserBuilder builder) {
    this.id = builder.id;
    this.username = builder.username;
    this.email = builder.email;
    this.displayName = builder.displayName;
    this.avatarUrl = builder.avatarUrl;
    this.password = builder.password;
    this.provider = builder.provider;
    this.providerId = builder.providerId;
    this.createdAt = builder.createdAt;
    this.updatedAt = builder.updatedAt;
    this.isEnabled = builder.isEnabled;
    this.roles = builder.roles;
    this.subscriptionTier = builder.subscriptionTier;
    this.subscriptionEndDate = builder.subscriptionEndDate;
  }


  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    if (roles == null) {
      return List.of();
    }

    return roles.stream()
        .map(role -> new SimpleGrantedAuthority(role.getName().name()))
        .collect(Collectors.toList());
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public AuthProvider getProvider() {
    return provider;
  }

  public void setProvider(AuthProvider provider) {
    this.provider = provider;
  }

  public String getProviderId() {
    return providerId;
  }

  public void setProviderId(String providerId) {
    this.providerId = providerId;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }

  public Instant getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Instant updatedAt) {
    this.updatedAt = updatedAt;
  }

  public boolean isEnabled() {
    return isEnabled;
  }

  public void setEnabled(boolean enabled) {
    isEnabled = enabled;
  }

  public Set<Role> getRoles() {
    return roles;
  }

  public void setRoles(Set<Role> roles) {
    this.roles = roles;
  }

  public SubscriptionTier getSubscriptionTier() {
    return subscriptionTier;
  }

  public void setSubscriptionTier(SubscriptionTier subscriptionTier) {
    this.subscriptionTier = subscriptionTier;
  }

  public Instant getSubscriptionEndDate() {
    return subscriptionEndDate;
  }

  public void setSubscriptionEndDate(Instant subscriptionEndDate) {
    this.subscriptionEndDate = subscriptionEndDate;
  }

  @Override
  public String getName() {
    return this.username;
  }


  public static class UserBuilder {

    private UUID id;
    private String username;
    private String email;
    private String displayName;
    private String avatarUrl;
    private String password;
    private AuthProvider provider;
    private String providerId;
    private Instant createdAt = Instant.now();
    private Instant updatedAt;
    private boolean isEnabled = false;
    private Set<Role> roles;
    private SubscriptionTier subscriptionTier = SubscriptionTier.FREE;
    private Instant subscriptionEndDate;

    public UserBuilder id(UUID id) {
      this.id = id;
      return this;
    }

    public UserBuilder username(String username) {
      this.username = username;
      return this;
    }

    public UserBuilder email(String email) {
      this.email = email;
      return this;
    }

    public UserBuilder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    public UserBuilder avatarUrl(String avatarUrl) {
      this.avatarUrl = avatarUrl;
      return this;
    }

    public UserBuilder password(String password) {
      this.password = password;
      return this;
    }

    public UserBuilder provider(AuthProvider provider) {
      this.provider = provider;
      return this;
    }

    public UserBuilder providerId(String providerId) {
      this.providerId = providerId;
      return this;
    }

    public UserBuilder createdAt(Instant createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    public UserBuilder updatedAt(Instant updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    public UserBuilder isEnabled(boolean isEnabled) {
      this.isEnabled = isEnabled;
      return this;
    }

    public UserBuilder roles(Set<Role> roles) {
      this.roles = roles;
      return this;
    }


    public UserBuilder subscriptionTier(SubscriptionTier subscriptionTier) {
      this.subscriptionTier = subscriptionTier;
      return this;
    }

    public UserBuilder subscriptionEndDate(Instant subscriptionEndDate) {
      this.subscriptionEndDate = subscriptionEndDate;
      return this;
    }

    public User build() {
      return new User(this);
    }
  }


}


