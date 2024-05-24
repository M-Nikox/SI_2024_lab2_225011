# Matej Nikolovski 225011

2. CFG:
   ![CFG](https://github.com/M-Nikox/SI_2024_lab2_225011/assets/101933576/17593bf6-f2a7-4cdd-a0bd-fb05569ad87d)

4. Цикломатската комплексност се пресметува со формулата V(G) = E - V + 2P или пак со V(G) = PN + 1 (Predicate Nodes)
   - V(G)=39-31+2*1=**10**
   - V(G)=9+1=10
   Цикломатската комплексност е **10**.
   
4.Every Branch тест случаи:

```
 - allItems = null фрла exception
 - allitems = [], payment = 0 резултат 0 и празен ArrayList
 - allitems = [], payment = -1 резултат -1 и празен ArrayList
 - allitems = [{"",null,200,0.4}] резултат 1 објект со празно име
 - allitems = [{"",012345,350,0.4}], payment = 2 резултат еден објект со баркод што почнува на 0
 - allItems=[{“Matej”,01f3456,350,0.4}] резултат објект со име и баркод што содржи буква во него 
 - allItems=[{“Matej”,123456, 200,-1}] резултат објект со негативен попуст
```

![image](https://github.com/M-Nikox/SI_2024_lab2_225011/assets/101933576/1b329abf-9e86-4e71-97ed-37f3b3d67204)

5.Multiple Condition тест случаи:
  
  ```
  -{100, 0.5, 01234} = false
  -{400, -2, 12345} = false
  -{400, 0.5, 12345} = false
  -{400, 0.5, 01234} = true
  ```

6.Успешен Build.
