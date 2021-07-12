#language: es
  #Autor: mesa.cristian@gmail.com

Característica: yo como usuario del sitio web de falabella
  quiero agregar un producto a la canasta
  para relizar la compra del mismo

  Antecedentes: abrir el sitio web
    Dado que el cliente se encuentra en el sitio web

  @Comprar
  Escenario: Comprar articulo
    Cuando agrega el producto a la canasta de compra
      | categoria  | tipoProducto | marca | tamano |
      | Tecnología | Televisores  | LG    | 82     |
    Y ingresa los datos de envio
      | departamento | ciudad   | direccion       | complementoDireccion |
      | Antioquia    | Medellin | Calle falsa 123 | casa                 |
    Entonces se encontrara en la pagina de pagos "https://www.falabella.com.co/falabella-co/checkout/payment/"
    Y vera el mensaje "Elige tu medio de pago"