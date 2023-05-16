
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import MachineManager from "./components/listers/MachineCards"
import MachineDetail from "./components/listers/MachineDetail"
import SpecManager from "./components/listers/SpecCards"
import SpecDetail from "./components/listers/SpecDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/machines',
                name: 'MachineManager',
                component: MachineManager
            },
            {
                path: '/machines/:id',
                name: 'MachineDetail',
                component: MachineDetail
            },
            {
                path: '/specs',
                name: 'SpecManager',
                component: SpecManager
            },
            {
                path: '/specs/:id',
                name: 'SpecDetail',
                component: SpecDetail
            },



    ]
})
