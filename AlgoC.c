#include <stdio.h>
#include <stdint.h>
#include <stdlib.h>

#define start 0x21
#define longitud 0x7E

char test(char i, char j,char k, char l,char m, char n);

int main(){
	char i,j,k,l,m,n;
	
		for (i = start; i < longitud; i++){
			for (j = start; j < longitud; j++){
				for (k = start; k < longitud; k++){
					for (l = start; l < longitud; l++){
						for (m = start; m < longitud; m++){
							for (n = start; n < longitud; n++){
								if(test(i,j,k,l,m,n)){
									printf("Found it: %c %c %c %c %c %c\n", i,j,k,l,m,n);
									exit(0);
								}
							}
						}
					}
				}
			}
		}
	return 0;
}

char test(char i, char j,char k, char l,char m, char n){
	char x = i+ j+ k+ l+ m+ n;
//printf("test it: %c %c %c %c %c %c %c\n", x, i,j,k,l,m,n);

	if((x + i) == 0x00) {
		if((x + j) == 0x00) {
			if((x + k) == 0x00) {
				if((x + l) == 0x00) {
					if((x + m) == 0x00) {
						if((x + n) == 0x00) {
							return 1;
						}
					}
				}
			}
		}
	}
	return 0;
}
