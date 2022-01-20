/**
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import Vue from 'vue';
import Vuex from 'vuex';
import App from './App.vue';
import BootstrapVue from 'bootstrap-vue';
import titleMixin from './mixins/titleMixin';
import VueToast from 'vue-toast-notification';
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap-vue/dist/bootstrap-vue.css';
import '@fortawesome/fontawesome-free/css/all.css';
import '@fortawesome/fontawesome-free/js/all.js';
import './css/app.css';
import 'vue-toast-notification/dist/theme-default.css';

Vue.use(Vuex);
Vue.use(BootstrapVue);
// https://vuejsexamples.com/yet-another-toast-notification-plugin-for-vue-js/
Vue.use(VueToast);
Vue.mixin(titleMixin);
Vue.config.productionTip = false;
new Vue({
  render: (h) => h(App),
}).$mount('#app');
