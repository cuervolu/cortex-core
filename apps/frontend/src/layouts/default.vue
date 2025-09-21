<script setup lang="ts">

</script>

<template>
  <div class="flex flex-col min-h-screen">
    <LayoutHeader />
    <main class="flex-1">
      <slot />
    </main>
    <LayoutFooter />
  </div>
</template>


<style scoped>

</style>