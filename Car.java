
public class Car {
		int gear = 1;
		int location;
		int speed = 0;
		final int destination = 250;
		
		void reverseGear()  {
			gear = -1;
			
		}
		
		void gearUp() {
			gear = gear + 1;
				if (gear == 6)
					System.out.println("The gear cannot be increased anymore!");
				if (gear < 0)
					gear = 1;
			}
		
		void gearDown() {
			gear = gear -1;
			if (gear == 1)
					System.out.println("The gear cannot be increased anymore!!");
			if (gear < 0)
					System.out.println("Cannot move gear if car is in reverse gear");
		}
		
		int reportGear() {
			return gear;
		}
		
		int reportLocation() {
			return location;
		}
		
		int reportRemaining() {
			return destination-location;
		}
	
		void moveByTime(int time) {
			if (time < 0)
					System.out.println("The number should be positive");
			speed = gear*20;
			int delta = speed * time; 
			location = location + delta;
		}
		
		boolean isArrived() {
			if (location >= destination){
				return true;
			}
			else { 
				return false;
			}
			
		}
		
	}
			

