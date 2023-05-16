<template>

    <v-data-table
        :headers="headers"
        :items="sepcView"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'SepcViewView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            sepcView : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/sepcViews'))

            temp.data._embedded.sepcViews.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.sepcView = temp.data._embedded.sepcViews;
        },
        methods: {
        }
    }
</script>

