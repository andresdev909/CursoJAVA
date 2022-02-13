// Call the dataTables jQuery plugin
$(document).ready(function() {
    cargarPersonas()
  $('#dTPersonas').DataTable();
});

async function cargarPersonas()
{
  const request = await fetch('persona', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
  });
  const content = await request.json();
  console.log(content);

  let tablas
  for(let elem of content)
  {
    let trashBtn = '<a href="#" onclick="eliminarPersona('+elem[0].id+')"class="fas fa-trash"></a>'
    let tabla = '<tr><td>'+elem[0].id+'</td><td>'+elem[0].nombre+'</td><td>'+elem[0].telefono+'</td><td>'+elem[0].email+'</td><td>'+elem[1].calle+'</td><td>'+elem[1].ciudad+'</td><td>'+elem[1].estado+'</td><td>'+elem[1].codigoPostal+'</td><td>'+elem[1].pais+'</td><td>'+trashBtn+'<br><a href="./editarPersona.html" class="fas fa-pen"></a></td></tr>'
    tablas += tabla
  }

  document.querySelector('#dTPersonas tBody').outerHTML = tablas

}

async function eliminarPersona(id)
{
    let result = confirm("Desea eliminar a esta persona?")
    if(result === true)
    {
        const request = await fetch('persona/'+id, {
                method: 'DELETE',
                headers: {
                  'Accept': 'application/json',
                  'Content-Type': 'application/json'
                },
              });
        location.reload()
    }else
    {}
}