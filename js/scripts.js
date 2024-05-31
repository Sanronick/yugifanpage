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
            

            var imgcarta=respuesta["data"][2578]["card_images"][0]["image_url_small"]
            var imgcartajaden=respuesta['data'][3570]['card_images'][0]['image_url_small']
            var imgcartayus=respuesta['data'][10701]["card_images"][0]["image_url_small"]
            var imgcartayuma=respuesta['data'][8028]['card_images'][0]['image_url_small']
            var imgcartayuya=respuesta['data'][8185]['card_images'][0]['image_url_small']
            

            let parayugi=document.getElementById("cartayugi")
            parayugi.innerHTML=`<img src="${imgcarta}" alt="Mago Oscuro">`
            let parajaden=document.getElementById('cartajaden')
            parajaden.innerHTML=`<img src="${imgcartajaden}" alt="Héroe elemental Neos">`
            let parayus=document.getElementById('cartayusei')
            parayus.innerHTML=`<img src="${imgcartayus}" alt="Dragón Polvo de Estrellas">`
            let parayuma=document.getElementById('cartayuma')
            parayuma.innerHTML=`<img src="${imgcartayuma}" alt="Numero 39: Utopía">`
            let parayuya=document.getElementById('cartayuya')
            parayuya.innerHTML=`<img src="${imgcartayuya}" alt="Dragón Pendulo de Ojos Anomalos">`
            
        }
    }
}
function vacio(){
    let parayugi=document.getElementById('cartayugi');
    parayugi.innerHTML='';
    let parajaden=document.getElementById('cartajaden');
    parajaden.innerHTML='';
    let parayus=document.getElementById('cartayusei');
    parayus.innerHTML='';
    let parayuma=document.getElementById('cartayuma');
    parayuma.innerHTML='';
    let parayuya=document.getElementById('cartayuya');
    parayuya.innerHTML='';
}

