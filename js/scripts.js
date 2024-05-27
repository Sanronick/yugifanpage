var cartayugi=document.getElementById('vercarta')
var cartayus=document.getElementById('vercartayus')

cartayugi.addEventListener('click',function(){
    obtenerCarta()
})
cartayus.addEventListener('click',function(){
    obtenerCarta()
})



function obtenerCarta(){
    let url='https://db.ygoprodeck.com/api/v7/cardinfo.php'


    //instancio la peticion

    const api=new XMLHttpRequest();

    //le paso el metodo
    api.open('GET',url,true)
    api.send()

    api.onreadystatechange=function(){
        if(this.status==200 && this.readyState==4){
            //contenido

            let respuesta=JSON.parse(this.responseText)
            console.log(respuesta)
            let respuesta2=JSON.parse(this.responseText)

            var imgcarta=respuesta["data"][2578]["card_images"][0]["image_url_small"]
            var imgcartayus=respuesta2['data'][10701]["card_images"][0]["image_url_small"]

            console.log(imgcarta)

            let parayugi=document.getElementById("cartayugi")
            parayugi.innerHTML=`<img src="${imgcarta}" alt="Mago Oscuro">`
            let parayusei=document.getElementById('cartayusei')
            parayusei.innerHTML=`<img src="${imgcartayus}" alt="Dragon Polvo de Estrellas">`
        }
    }
}

var cartajaden=document.getElementById('vercartaj')
cartajaden.addEventListener('click',function(){
    obtenerCartaj()
})

function obtenerCartaj(){
    let url='https://db.ygoprodeck.com/api/v7/cardinfo.php'


    const api=new XMLHttpRequest();
    api.open('GET',url,true)
    api.send()
    api.onreadystatechange=function(){
        if(this.status==200 && this.readyState==4){
            let respuesta=JSON.parse(this.responseText)
            console.log(respuesta)
            var imgcarta=respuesta['data'][3570]['card_images'][0]['image_url_small']
            console.log(imgcarta)
            let parajaden=document.getElementById('cartajaden')
            parajaden.innerHTML=`<img src="${imgcarta}" alt="Héroe elemental Neos">`
        }
    }
}