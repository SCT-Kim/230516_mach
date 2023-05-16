<template>
    <v-card outlined style="border-radius: 0; max-height:15vh; margin-top:-10px;">
        <v-card-title>
            SepcView
        </v-card-title>
    
        <v-card-text>
            <v-row no-gutters style="margin: 15px 0px -30px -15px;">
                <v-col style="max-width:140px;">
                    <String class="attributes-list" label="SpecCd" v-model="value.parameters.specCd" :editMode="editMode"/>
                </v-col>
                <v-col style="max-width:140px;">
                    <String class="attributes-list" label="SpecNm" v-model="value.parameters.specNm" :editMode="editMode"/>
                </v-col>
                <v-col>
                    <v-btn class="gs-query-search-btn"
                        @click="search"
                        flat
                        small
                    >
                        <v-icon small>mdi-magnify</v-icon>검색
                    </v-btn>
                </v-col>
            </v-row>
        </v-card-text>
    </v-card>
</template>

<script>
    export default {
        name: 'SepcViewQuery',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {
                apiPath: 'findBySpecCdOrSpecNm',
                parameters: {}
            },
        }),
        created() {
            this.value.parameters.specCd = '';
            this.value.parameters.specNm = '';
        },
        watch: {
        },
        methods: {
            search() {
                let search = null;
                if(this.value.parameters.specCd == ''  && this.value.parameters.specNm == '' ) {
                    search = null;
                }else{
                    search = this.value;
                }
                this.$emit('search', search);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>
<style>
.attributes-list{
    margin-left: 15px;
}
</style>

