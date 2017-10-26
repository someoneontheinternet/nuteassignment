		int size = 10;
		String a = "";
		for (int i = 0; i <= size; i ++) {
			a += " ";
		}
		String b = " ";
		
		for (int i = 0; i <= size * 2 + 2; i++) {
			if (i <= size) {
				int s = i;
				if (s == 0) {
					System.out.println(a + "*");
				} else {
					System.out.print(a + "* ");
					for (int k = 0; k < s - 1; k++) {
						System.out.print("  ");
					}
					System.out.println("*");
				}
				a = a.substring(0, a.length() - 1);
			} else {
				int s = size - (i - size - 2);
				if (s == 0) {
					System.out.println(a + "*");
				} else {
					System.out.print(a + "* ");
					for (int k = 0; k < s - 1; k++) {
						System.out.print("  ");
					}
					System.out.println("*");
				}
				a += " ";
			}
		}
