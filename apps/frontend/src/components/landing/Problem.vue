<script setup lang="ts">
import {Globe, Film, Terminal} from 'lucide-vue-next';
</script>

<template>
  <div class="flex flex-col items-center justify-center space-y-4 text-center">
    <div class="space-y-2">
      <h2 class="text-3xl font-bold tracking-tighter sm:text-5xl">
        ¿Te suena familiar?
      </h2>
      <p class="max-w-[900px] text-muted-foreground md:text-xl/relaxed lg:text-base/relaxed xl:text-xl/relaxed">
        Aprender a programar en línea puede ser una carrera de obstáculos. Muchos caemos en las
        mismas trampas.
      </p>
    </div>
  </div>
  <div
      class="mx-auto grid items-start gap-8 sm:max-w-4xl sm:grid-cols-2 md:gap-12 lg:max-w-5xl lg:grid-cols-3">
    <Card>
      <CardHeader class="pb-4">
        <div
            class="mb-2 h-10 w-10 flex items-center justify-center rounded-lg bg-primary/10 text-primary">
          <Globe class="h-6 w-6"/>
        </div>
        <CardTitle>Barrera del Idioma</CardTitle>
      </CardHeader>
      <CardContent>
        <p class="text-sm text-muted-foreground">
          Los mejores recursos están en inglés, con traducciones automáticas o jergas que nadie
          entiende.
        </p>
      </CardContent>
    </Card>

    <Card>
      <CardHeader class="pb-4">
        <div
            class="mb-2 h-10 w-10 flex items-center justify-center rounded-lg bg-primary/10 text-primary">
          <Film class="h-6 w-6"/>
        </div>
        <CardTitle>Aprendizaje Pasivo</CardTitle>
      </CardHeader>
      <CardContent>
        <p class="text-sm text-muted-foreground">
          Pasas horas viendo videos, pero al momento de escribir código por tu cuenta, te quedas en
          blanco.
        </p>
      </CardContent>
    </Card>

    <Card>
      <CardHeader class="pb-4">
        <div
            class="mb-2 h-10 w-10 flex items-center justify-center rounded-lg bg-primary/10 text-primary">
          <Terminal class="h-6 w-6"/>
        </div>
        <CardTitle>Fricción de Configuración</CardTitle>
      </CardHeader>
      <CardContent>
        <p class="text-sm text-muted-foreground">
          Instalar el entorno de desarrollo, las variables de entorno y las dependencias es más
          difícil que la propia lección.
        </p>
      </CardContent>
    </Card>
  </div>
</template>

<style scoped>

</style>