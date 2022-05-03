const encuentrame = () => {
    //todo o processo de localização

    const success = (position) => {
        const divCoordenadas = document.getElementById("coordenadas");
        const divMapa = document.getElementById("mapa");
        console.log(position);
        const { latitude , longitude } = position.coords;
        console.log(latitude, longitude);

        divCoordenadas.innerHTML = `lat: ${latitude}, lng: ${longitude}`;
    
        //mapa
        // https://www.mapquestapi.com/staticmap/v5/map?key=KEY&locations=LOCATION&size=WIDTH,HEIGHT
        const mapa = new Image();
        mapa.src = `https://www.mapquestapi.com/staticmap/v5/map?key=qNp0cOq2DACGaiARunOOo1NUmr5HtRYn&locations=${latitude},${longitude}&size=600,800`;
        divMapa.appendChild(mapa);
    };

    const errorPosicion = (error) => {
        const divCoordenadas = document.getElementById("coordenadas");
        divCoordenadas.innerHTML = `Erro ao obter localização:<br> Error ${error.code}: ${error.message}`;
    };

    navigator.geolocation.getCurrentPosition( success , errorPosicion );
};

const verificarGeo = () => {
    if(!navigator.geolocation){
    //não suporta localização
    const divCoordenadas = document.getElementById("coordenadas");
    divCoordenadas.innerHTML ="<p>localização não suportada pelo navegador</>";
    return;
    }
 //Se suportar, chamar a localização
  encuentrame();
};

verificarGeo();