/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
window.addEventListener('load',function (){
    document.getElementById('btniniciar').addEventListener('click', function (){
        var usuario = document.getElementById('txtusuario').value;
        var pass = document.getElementById('txtpass').value;
        
        
        var bandera= false;
        
        if(usuario.length > 0 && pass.length >0  ){
            bandera=true;
        }if(bandera){
            document.getElementById('iniciosesion').submit();
            
        }else {
            alert('falta usuario o contraseña');
        }
     
    
    });
});


