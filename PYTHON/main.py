from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola mundo")
    car = Car("GCW294", Account("CAMILO CUERVO", "CC1015451722"))
    print(vars(car))
    print(vars(car.driver))
