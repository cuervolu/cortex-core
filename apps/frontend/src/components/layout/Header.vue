<script setup lang="ts">
  import { Box } from 'lucide-vue-next';
</script>

<template>
  <header class="px-4 lg:px-6 h-14 flex items-center border-b">
    <a href="#" class="flex items-center justify-center">
      <Box class="h-6 w-6" />
      <span class="sr-only">Cortex</span>
    </a>
    <nav class="ml-auto flex gap-4 sm:gap-6">
      <Button variant="outline" as-child>
        <a href="#cta-final">
          Obtener Acceso
        </a>
      </Button>
    </nav>
  </header>
</template>

<style scoped>

</style>