// https://nuxt.com/docs/api/configuration/nuxt-config
export default defineNuxtConfig({
  compatibilityDate: '2025-07-15',
  devtools: { enabled: true },
  content: {
    experimental: { sqliteConnector: 'native' },
  },
  modules: [
    '@nuxt/fonts',
    '@nuxt/test-utils',
    '@nuxt/content',
    '@nuxtjs/seo',
    '@pinia/nuxt',
    '@nuxtjs/tailwindcss',
    '@nuxtjs/color-mode',
    '@vueuse/nuxt',
    'shadcn-nuxt',
  ],
  srcDir: 'src',
  site: {
    url: 'https://cortex.com',
    name: 'Cortex',
    description: 'Donde las Ideas se Convierten en Código.',
  },
  shadcn: {
    prefix: '',
    componentDir: 'src/components/ui',
  },
  colorMode: {
    classSuffix: '',
  },
  fonts: {
    families: [
      {
        name: 'Montserrat',
        provider: 'fontsource',
        weights: ['400', '500', '600', '700', '800', '900'],
      },
    ],
  },
  plugins: [
    '~/plugins/ssr-width.ts',
  ],
})