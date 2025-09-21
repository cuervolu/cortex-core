<script setup lang="ts">
import {Gem, Zap, MapPin} from 'lucide-vue-next';
</script>

<template>
  <div class="flex flex-col items-center justify-center space-y-4 text-center">
    <div class="space-y-2">
      <div class="inline-block rounded-lg bg-muted px-3 py-1 text-sm">
        Nuestra Metodología
      </div>
      <h2 class="text-3xl font-bold tracking-tighter sm:text-5xl">
        Así lo Hacemos Diferente
      </h2>
      <p class="max-w-[900px] text-muted-foreground md:text-xl/relaxed lg:text-base/relaxed xl:text-xl/relaxed">
        En Cortex, no solo consumes contenido, lo aplicas. Nuestra plataforma está diseñada sobre
        tres pilares fundamentales.
      </p>
    </div>
  </div>
  <div
      class="mx-auto grid items-start gap-8 sm:max-w-4xl sm:grid-cols-2 md:gap-12 lg:max-w-5xl lg:grid-cols-3">
    <div class="grid gap-1 text-center">
      <div
          class="mx-auto mb-2 h-10 w-10 flex items-center justify-center rounded-lg bg-primary/10 text-primary">
        <Gem class="h-6 w-6"/>
      </div>
      <h3 class="text-lg font-bold">Profundidad sobre Amplitud</h3>
      <p class="text-sm text-muted-foreground">
        No te damos 100 cursos superficiales. Te ofrecemos una ruta de aprendizaje completa para que
        domines un área de verdad.
      </p>
    </div>
    <div class="grid gap-1 text-center">
      <div
          class="mx-auto mb-2 h-10 w-10 flex items-center justify-center rounded-lg bg-primary/10 text-primary">
        <Zap class="h-6 w-6"/>
      </div>
      <h3 class="text-lg font-bold">Metodología Activa</h3>
      <p class="text-sm text-muted-foreground">
        Micro-teoría y desafío inmediato. Cada concepto que aprendes lo aplicas al instante en
        nuestro editor de código.
      </p>
    </div>
    <div class="grid gap-1 text-center">
      <div
          class="mx-auto mb-2 h-10 w-10 flex items-center justify-center rounded-lg bg-primary/10 text-primary">
        <MapPin class="h-6 w-6"/>
      </div>
      <h3 class="text-lg font-bold">Relevancia Cultural</h3>
      <p class="text-sm text-muted-foreground">
        Olvídate de ejemplos genéricos. Aquí usarás APIs y resolverás problemas con datos de Chile y
        LATAM.
      </p>
    </div>
  </div>
</template>
<style scoped>

</style>