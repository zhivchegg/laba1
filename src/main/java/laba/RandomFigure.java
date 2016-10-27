package laba;

import laba.*;
import java.util.*;

public class RandomFigure {
	static private Point randomPoint(Random r) {
		Point p = new Point();
		p.x = r.nextDouble() * 100;
		p.y = r.nextDouble() * 100;
		return p;
	}
	static Figure generate() {
		Random r = new Random();
		FigureWithPoints f;
		int n;
		try {
			switch (r.nextInt(4)) {
			case 0:
				return new Circumference(randomPoint(r), r.nextDouble() * 100);
			case 1:
				return new Otrezok(randomPoint(r), randomPoint(r));
			case 2:
				f = new Lomannaya();
				n = r.nextInt(4) + 3;
				for (int i = 0; i < n; i++)
					f.addPoint(0, randomPoint(r));

				return f;
			case 3:
				f = new Mnogougolnik();
				n = r.nextInt(4) + 3;
				for (int i = 0; i < n; i++)
					f.addPoint(0, randomPoint(r));

				return f;
			}
		} catch (GeometricException e) {
			//Скорее всего совпали точки, просто попробуем пересосдать
			//Вероятность того, что это будет часто происходить ничтожно
			//Но тем не менее это быдлокод :)
			return generate();
		}
		return null;
	}
}
