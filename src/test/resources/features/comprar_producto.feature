#language: es
  #Autor: mesa.cristian@gmail.com

Característica: yo como usuario del sitio web de falabella
  quiero agregar un producto a la canasta
  para relizar la compra del mismo

  Escenario: comparar articulo
    Dado que el cliente se encuentra en el sitio web
    Cuando agrega el producto a la canasta de compra
    Entonces se encontrara en la pagina de pagos "https://www.falabella.com.co/falabella-co/checkout/payment/"
    Y vera el mensaje "PAGA CON TU TARJETA CMR BANCO FALABELLA"