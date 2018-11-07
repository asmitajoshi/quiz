#!/usr/bin/python

# missing number from sorted array
items = [1, 2, 3, 5]

def bin_search(start, items):
#  print 'items: ' + str(items)
  count = len(items)
#  print 'length of items: ' + str(count)
  if (count == 1):
    if (start + 1 == items[0]): # if number is already in items
      print 'found missing number: ' + str(start)
      return
    else:
      print 'found missing number: ' + str(start + 1)
      return
  half = int(count / 2)
#  print 'middle elem: ' + str(half)
  expected_num = start + half
  got_num = items[half]
#  print 'expected in middle: ' + str(expected_num)
#  print 'got in middle: ' + str(got_num)
  if got_num == expected_num:
#    print 'got ' + str(items[half::])
    bin_search(items[half], items[half::])
  elif got_num != expected_num:
#    print 'not got ' + str(items[0:half])
    bin_search(start, items[0:half])


items = [1, 2, 3, 5]
bin_search(1, items)

items = [1, 2, 3, 5, 6, 7, 8]
bin_search(1, items)

items = [1, 2, 3, 4, 5, 6, 8, 9, 10]
bin_search(1, items)

items = [1, 3, 4, 5, 6, 7, 8, 9, 10]
bin_search(1, items)

items = [2, 3, 4, 5, 6, 7, 8, 9, 10]
bin_search(1, items)

items = [1, 2, 3, 4, 6, 7, 8, 9, 10]
bin_search(1, items)
