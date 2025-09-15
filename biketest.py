import unittest

class TestBikeFunctions(unittest.TestCase):

    def test_gear_one_adds_one(self):
        self.assertEqual(gear_one(15), 16)
        self.assertEqual(gear_one(0), 1)
        self.assertEqual(gear_one(-5), -4)

    def test_accelerate_valid_gear_1(self):
        try:
            accelerate(10, 1)
        except Exception:
            self.fail("accelerate() raised Exception unexpectedly for gear 1")

    def test_accelerate_valid_gear_4(self):
        try:
            accelerate(50, 4)
        except Exception:
            self.fail("accelerate() raised Exception unexpectedly for gear 4")

    def test_accelerate_invalid_gear_above_4(self):
        with self.assertRaises(ValueError) as context:
            accelerate(25, 5)
        self.assertEqual(str(context.exception), "Invalid gear: must be between 1 and 4")

    def test_accelerate_invalid_gear_below_1(self):
        with self.assertRaises(ValueError) as context:
            accelerate(25, 0)
        self.assertEqual(str(context.exception), "Invalid gear: must be between 1 and 4")

if __name__ == "__main__":
    unittest.main()
