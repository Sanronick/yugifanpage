console.log('Entro a GetRequest')
document.addEventListener('DOMContentLoaded',function(){
    const seccionUsuario=document.getElementById('usuarios');
    const usuarios=[];

    function cargarUsuarios() {
        console.log("Entro a cargar Usuarios")
        fetch('/yugioh/usuarios?action=getAll')
            .then(response=>response.json())
            .then(data=>{
                console.log('data : '+data);
                data.forEach(usuario => {
                    usuarios.push(usuario);
                    seccionUsuario.innerHTML+=`
                    <tr>
                    <td>${usuario.nombre}</td>
                    <td>${usuario.apellido}</td>
                    <td>${usuario.email}</td>
                    <td>${usuario.nick}</td>
                    <td>${usuario.psw}</td>
                    <td>${usuario.sexo}</td>
                    <td>${usuario.edad}</td>
                    </tr>`
                    
                });
            });
        
    }
    cargarUsuarios();
})