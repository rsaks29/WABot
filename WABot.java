import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class WABot {
    public static void main(String[] args) throws AWTException {
        Robot bot = new Robot();
//        bot.delay(500);
//        System.out.println(MouseInfo.getPointerInfo().getLocation());
        bot.mouseMove(73,856);
        bot.mousePress(InputEvent.BUTTON1_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_MASK);
        bot.mouseMove(159,338);
        bot.mousePress(InputEvent.BUTTON1_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_MASK);

        for (int i = 0; i<1; i++) {
            sendKeys(bot, "Hello");
        }
    }
    public static void sendKeys(Robot bot, String whatToType) {
        for (int i=0; i<whatToType.length(); i++) {
            String letter = whatToType.substring(i, i+1);
            char c=letter.charAt(0); // convert string into char
            int keyCode=KeyEvent.getExtendedKeyCodeForChar(c);
            bot.keyPress(keyCode);
            bot.keyRelease(keyCode);
        }
        bot.keyPress(KeyEvent.VK_ENTER);
        bot.keyRelease(KeyEvent.VK_ENTER);
    }
}
