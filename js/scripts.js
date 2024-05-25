var cartayugi=document.getElementById('vercarta')

cartayugi.addEventListener('click',function(){
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

            var imgcarta=respuesta["data"][2578]["card_images"][0]["image_url_small"]

            console.log(imgcarta)

            let parayugi=document.getElementById("cartayugi")
            parayugi.innerHTML=`<img src="${imgcarta}" alt="Mago Oscuro">`
        }
    }
}