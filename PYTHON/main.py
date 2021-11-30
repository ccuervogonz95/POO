from car import Car

if __name__ == "__main__":
    print("Hola mundo")
    car = Car()
    car.license = "GCW294"
    car.driver = "Camilo Cuervo"
    print(vars(car))

    car2 = Car()
    car2.license = "AFX196"
    car2.driver = "Ana Garcia"
    print(vars(car2))
