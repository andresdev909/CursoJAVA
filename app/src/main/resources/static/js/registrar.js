
async function registrarPersona()
{
  let datosPer = {}
  datosPer.nombre = document.querySelector('#perNombre').value
  datosPer.email = document.querySelector('#perEmail').value
  datosPer.telefono = document.querySelector('#perTelefono').value

  let datosDir = {}
  datosDir.direccion = document.querySelector('#PerDir').value
  datosDir.ciudad = document.querySelector('#perCiudad').value
  datosDir.depar = document.querySelector('#perDep').value
  datosDir.codigo = document.querySelector('#perCodigo').value
  datosDir.pais = document.querySelector('#perPais').value

  const request1 = await fetch('address', {
      method: 'POST',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
      body: JSON.stringify(datosDir)
    });

  const request2 = await fetch('persona', {
      method: 'GET',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
    });
    const content = await request2.json();

    datosPer.idDir = content.id

  const request3 = await fetch('persona', {
    method: 'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    body: JSON.stringify()
  });

  }