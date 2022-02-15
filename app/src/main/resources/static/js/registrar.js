
async function registrarPersona()
{
  let datosPer = {}
  datosPer.nombre = document.getElementById('perNombre').value
  datosPer.email = document.getElementById('perEmail').value
  datosPer.telefono = document.getElementById('perTelefono').value
  datosPer.direccion = document.getElementById('PerDir').value
  datosPer.ciudad = document.getElementById('perCiudad').value
  datosPer.depar = document.getElementById('perDep').value
  datosPer.codigo = document.getElementById('perCodigo').value
  datosPer.pais = document.getElementById('perPais').value

  /*Funcion que hcar el inset a la base de datos de direccion*/

  const request3 = await fetch('persona', {
    method: 'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(datosPer)
  });

  }