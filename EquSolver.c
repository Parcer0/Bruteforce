/*Equation solver for those of you that hate math xD
*/


#include <stdio.h>
#include <stdint.h>
#define _USE_GNU
#define _XOPEN_SOURCE

int solver(int a);

int main(){
	int x = 0;
	while(++x != 0) {
		if(solver(x)){
			printf("%d\n",x);
		}
	}
}

int solver(int a){
	return ((a+2*2) == 18);
}
