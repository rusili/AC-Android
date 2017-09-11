public static void main(String[] args) {
        Keyboard_Keys[] input = {
                Keyboard_Keys.A,
                Keyboard_Keys.SPACE,
                Keyboard_Keys.D,
                Keyboard_Keys.O,
                Keyboard_Keys.NEWLINE,
                Keyboard_Keys.G
        };

        for (int index = 0; index < input.length; index++){
            Keyboard_Keys currentKey = input[index];
            handleTypewriterKey(currentKey);
        }
    }

    public static void handleTypewriterKey(Keyboard_Keys key){
        // Your code here
    }
