#probability it being neighter king or spade

total_card=52
total_king=4  #total king in card
total_spade=13

total_king_spade=total_king+total_spade-1
without_king_spade=total_card-total_king_spade
pro=without_king_spade/total_card
print("probability is neighter king or spade is {}".format(pro))