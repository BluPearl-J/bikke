def gear_one(speed):
    return speed + 1

def accelerate(speed, gear_constant):
    if gear_constant > 4 or gear_constant < 1:
        raise ValueError("Invalid gear: must be between 1 and 4")
    result = speed + gear_constant
    print(f"Accelerated speed: {result}")

def main():
    try:
        speed = float(input("Enter current speed: "))
    except ValueError:
        print("Invalid speed input. Exiting...")
        return

    try:
        gear = int(input("Enter gear (1 to 4): "))
    except ValueError:
        print("Gear must be a number. Exiting...")
        return

    if gear == 1:
        if speed < 0 or speed > 20:
            raise ValueError("Gear 1 speed must be between 0 and 20")
        accelerate(speed, 1)
    elif gear == 2:
        if speed < 21 or speed > 30:
            raise ValueError("Gear 2 speed must be between 21 and 30")
        accelerate(speed, 2)
    elif gear == 3:
        if speed < 31 or speed > 40:
            raise ValueError("Gear 3 speed must be between 31 and 40")
        accelerate(speed, 3)
    elif gear == 4:
        if speed < 41:
            raise ValueError("Gear 4 speed must be 41 or above")
        accelerate(speed, 4)
    else:
        print("Invalid gear selection.")

if __name__ == "__main__":
    main()
