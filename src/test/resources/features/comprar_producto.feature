#language: es
  #Autor: mesa.cristian@gmail.com

Característica: yo como usuario del sitio web de falabella
  quiero agregar un producto a la canasta
  para relizar la compra del mismo

  Antecedentes: abrir el sitio web
    Dado que el cliente se encuentra en el sitio web

  @Comprar
  Escenario: comparar articulo
    Cuando agrega el producto a la canasta de compra
      | categoria  | tipoProducto | marca | tamano |
      | Tecnología | Televisores  | LG    | 70     |
    Entonces se encontrara en la pagina de pagos "https://www.falabella.com.co/falabella-co/checkout/payment/"
    Y vera el mensaje "Elige tu medio de pago"