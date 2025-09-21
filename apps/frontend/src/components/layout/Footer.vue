<script setup lang="ts">
  import { Github, Twitter } from 'lucide-vue-next';
  import { Button } from '@/components/ui/button';
</script>

<template>
  <footer class="flex flex-col gap-2 sm:flex-row py-6 w-full shrink-0 items-center px-4 md:px-6 border-t">
    <p class="text-xs text-muted-foreground">
      &copy; 2025 Cortex. Todos los derechos reservados.
    </p>
    <nav class="sm:ml-auto flex gap-4 sm:gap-6">
      <Button variant="ghost" size="icon" as-child>
        <a href="#" class="text-muted-foreground">
          <Github class="h-4 w-4" />
        </a>
      </Button>
      <Button variant="ghost" size="icon" as-child>
        <a href="#" class="text-muted-foreground">
          <Twitter class="h-4 w-4" />
        </a>
      </Button>
    </nav>
  </footer>
</template>

