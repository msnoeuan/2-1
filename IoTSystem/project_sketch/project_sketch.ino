#include <IRremote.hpp>  // 적외선 통신 라이브러리
#include <Wire.h>  // LCD 라이브러리
#include <LiquidCrystal_I2C.h>  // LCD 라이브러리

LiquidCrystal_I2C lcd(0x27, 16, 2);  // LCD
int buzzer = 8;  // buzzer
const int irReceiverPin = 2;  //IR             //pin the receiver is connected to

IRrecv irrecv(irReceiverPin);            //create an IRrecv object
decode_results decodedSignal;   //stores results from IR detectorvoid

void setup()
{
	lcd.begin(); 
	lcd.backlight();

  pinMode(buzzer, OUTPUT);

  // Open serial communications and wait for port to open:
   Serial.begin(9600);
   while (!Serial) {
   ; // wait for serial port to connect. Needed for Leonardo only
   }
  irrecv.enableIRIn();                   // Start the receiver object
}

boolean lightState = false;     //keep track of whether the LED is on
unsigned long last = millis();  //remember when we last received an IR message
boolean buzzerSet = false;

void loop() {
  // 전원 키는 if
  if (irrecv.decode())  // IR 리모컨으로부터 신호를 수신하는 함수
  {
    if (millis() - last > 250/*250*/) 
    {       
      Serial.print("value=");
      Serial.println(irrecv.decodedIRData.decodedRawData);
      Serial.print("decode_type=");
      Serial.println(decodedSignal.decode_type);

      if(irrecv.decodedIRData.decodedRawData == 3125149440) {  // 전원버튼
        lcd.display();
        lcd.print("Hello");
        lightState = !lightState;  //Yes: toggle the LED
      }

      delay(3000);

      if(lightState) {
        lcd.clear();
        lcd.print("1. timer");
        lcd.setCursor(0, 1);
        lcd.print("2. cancel");
      }
    }    
    last = millis();
    irrecv.resume();       // watch out for another message
  }
  
  // 전원이 켜지면 메뉴 선택
  while(lightState) {
    if(irrecv.decode()) {
      if(millis() - last > 250) {
        if(irrecv.decodedIRData.decodedRawData == 4077715200) {
          lcd.clear();
          // lcd.print("num1");
          // digitalWrite(buzzer,HIGH);
          // delay(1000);
          // digitalWrite(buzzer, LOW);
          // break;          
          lcd.print("press buttons");
          lcd.setCursor(0, 1);
          lcd.print("you want ex)0230");
          buzzerSet = !buzzerSet;
          break;
        }

        if(irrecv.decodedIRData.decodedRawData == 3877175040) {
          lcd.clear();
          lcd.print("num2");
          break;
        }
      }
      last = millis();
      irrecv.resume();
    }
  }

  delay(3000);

  while(buzzerSet) {
    lcd.clear();
    lcd.setCursor(0, 0);

    if(irrecv.decode()) {
      if(millis() - last > 250) {
        if(irrecv.decodedIRData.decodedRawData == 3910598400) {  // 0
          lcd.print(0);
          break;
        }
        
        if(irrecv.decodedIRData.decodedRawData == 4077715200) {  // 1
          lcd.print(1);
          break;
        }
        
        if(irrecv.decodedIRData.decodedRawData == 3877175040) {  // 2
          lcd.print(2);
          break;
        }
        
        if(irrecv.decodedIRData.decodedRawData == 2707357440) {  // 3
          lcd.print(3);
          break;
        }
        
        if(irrecv.decodedIRData.decodedRawData == 4144561920) {  // 4
          lcd.print(4);
          break;
        }
        
        if(irrecv.decodedIRData.decodedRawData == 3810328320) { // 5
          lcd.print(5);
          break;
        }
        
        if(irrecv.decodedIRData.decodedRawData == 2774204160) {  // 6
          lcd.print(6);
          break;
        }
        
        if(irrecv.decodedIRData.decodedRawData == 3175284480) {  // 7
          lcd.print(7);
          break;
        }
        
        if(irrecv.decodedIRData.decodedRawData == 2907897600) {  // 8
          lcd.print(8);
          break;
        }
        
        if(irrecv.decodedIRData.decodedRawData == 3041591040) {  // 9
          lcd.print(9);
          break;
        }
      }
    }
    last = millis();
    irrecv.resume();
  }
}
