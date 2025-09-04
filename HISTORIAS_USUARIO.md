# Historias de Usuario - Caso de Estudio Distribuidora de Alimentos

## Historia 1: Registro de usuario
**Como** cliente de la distribuidora,  
**quiero** poder registrarme en la aplicación con mi cuenta Gmail,  
**para** acceder al sistema y realizar mis compras de manera segura.  

**Criterios de aceptación:**
- El sistema debe validar que el correo corresponde a un formato Gmail.  
- El registro debe quedar almacenado en la base de datos.  

---

## Historia 2: Ingresar compra
**Como** cliente,  
**quiero** ingresar el monto total de mi compra y la distancia en kilómetros de mi domicilio,  
**para** que el sistema calcule automáticamente el costo de despacho.  

**Criterios de aceptación:**
- El sistema debe permitir ingresar monto y distancia como números válidos.  
- Si el monto es mayor a $50.000, debe informar “despacho gratuito hasta 20 km”.  
- Si el monto está entre $25.000 y $49.999, debe calcular costo = $150 × km.  
- Si el monto es menor a $25.000, debe calcular costo = $300 × km.  

---

## Historia 3: Consultar resultado
**Como** cliente,  
**quiero** visualizar el detalle de mi compra y el cálculo del despacho,  
**para** confirmar cuánto pagaré en total antes de finalizar la compra.  

**Criterios de aceptación:**
- El sistema debe mostrar el valor ingresado de la compra.  
- El sistema debe mostrar el costo calculado del envío.  
- El sistema debe mostrar el total final = compra + despacho (si aplica).  

---

## Historia 4: Seguridad y acceso
**Como** administrador del sistema,  
**quiero** que los usuarios solo accedan con su correo Gmail,  
**para** garantizar un nivel básico de seguridad en los registros.  

**Criterios de aceptación:**
- Solo se permite registro/login con cuentas Gmail.  
- El sistema debe validar credenciales antes de permitir el ingreso.
