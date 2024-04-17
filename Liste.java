package yepyeni;

public class Liste {
	Bagli on;
	Bagli son;
	void basElemanEkle (int a) {
		Bagli eleman = new Bagli ();
		eleman.veri = a;
		if (on == null) {
			on = eleman;
			son = eleman;
		}
	}
	void sonElemanEkle (int c) {
		Bagli eleman1 = new Bagli();
		eleman1.veri = c;
		if (on == null) {
			on = eleman1;
			son = eleman1;
		}
		else {
			son.next = eleman1;
			eleman1.prev = son;
			eleman1 = son;
		}
	}
	void yazdir () {
		Bagli ref = on;
		while (ref != null) {
			System.out.println("---------------->" + ref.veri);
			ref = ref.next;
		}
	}
	void arayaEkle (int a , int b) {
		Bagli eleman2 = new Bagli();
		eleman2.veri = b;
		Bagli ref1 = on;
		//A İNDİS NUMARASIDIR!
		int d = 0;
		while (d != a) {
			ref1 = ref1.next;
			d++;
		}
		ref1.prev.next = eleman2;
		eleman2.next = ref1;
		eleman2.prev = ref1.prev;
		ref1.prev = eleman2;
		
	}
}
