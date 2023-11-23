// Call the dataTables jQuery plugin
$(document).ready(function() {

    cargarUsuarios();

  $('#usuarios').DataTable();
});



async function cargarUsuarios(){

    const request = await fetch('usuarios', {
        method : 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
    });

    const respuesta = await request.json();

    let listadoHTML = "";

    for(let usuario of respuesta){
        let userHTML = "<tr><td>"+usuario.id+"</td><td>"+usuario.nombre+" "+usuario.apellido+"</td><td>"+usuario.email+"</td><td>"+usuario.telefono+"</td><td>"+'<a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>'+"</td></tr>";
        listadoHTML += userHTML;
    }


    document.querySelector('#usuarios tbody').outerHTML = listadoHTML;
}
