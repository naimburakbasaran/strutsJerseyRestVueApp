<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<script src="https://cdn.jsdelivr.net/npm/vue@2.5.16/dist/vue.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/vue-resource/1.3.4/vue-resource.min.js" ></script>
<html>
<head>
</head>
<body>

<div id='app'>
    <p>{{message.title}}</p>
</div>


<script>

    var url = "http://localhost:1453/rest/User/getUserInfo";

    Vue.use(VueResource)

    var app = new Vue({
        el: "#app",
        data: {
            message: []
        },
        methods: {
            work(){
                alert(url);
                console.log(this);
                this.$http.get(url).then(function(response){
                    this.message = response.data;
                }, function(error){
                    alert(error.statusText);
                });
            }
        },
        created(){
            this.work();
        }
    });
</script>
</body>
</html>