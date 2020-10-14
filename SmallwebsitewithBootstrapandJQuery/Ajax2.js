console.log('correcto');

//document.querySelector('#boton').addEventListener('click', function(){
//	traerDatos();//aqui poner el nombre del textbox
//});

function traerDatos(NombreDeInput)
{

	console.log('Dentro de la funcion');

	let url = `https://api.github.com/users/${NombreDeInput}`;

	const api = new XMLHttpRequest();

	api.open('GET',url,true);

	api.send();

	api.onreadystatechange = function()
	{
		if(this.readyState == 4 && this.status == 200)		
		{
			let datos = JSON.parse(this.responseText);
			console.log('datos.followers');
			let resultado = document.querySelector('#resultado');
			resultado.innerHTML = '';

			let i =0;

			for(let item of datos)
			{
				i++;
				resultado.innerHTML +=`<li>${item.name} | ${item.blog} | ${item.followers} </li>`;

				if(i>=1)
				{

					break;
				}
			}
		}
	}
}