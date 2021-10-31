from django.shortcuts import render

# Create your views here.

def hash1(message, maxval):
    sum = 0
    for letter in message:
        sum += ord(letter)
    if sum <= maxval:
        return sum  
    else:
        return sum % (maxval + 1)

def hash2(message):
    a = 19
    b = 3
    c = 256
    x = {}
    t = {}
    sum = 0
    y={}
    t[0] = 101
    for i in range(1,len(message)+1):
        print(message,i)
        x[i] = int(bin(int(message[i-1])),2)
        t[i] = (a * t[i-1] + b) % c
    print(x,t)
    for i in range(1,len(t)):
        t[i] = int(bin(t[i]),2)
        
        y[i] = bin(x[i] ^ t[i])
        print(bin(x[i]),bin(t[i]),y[i])
        
        y[i] = int(y[i], 2)
        
        sum += y[i]
    return sum % 256

def main(request):
    if request.method == "POST":
        form = {
            'message': request.POST['message'],
            'maxval': request.POST['maxval']
        }
        if form['message'] and form['maxval']:
            form['result1'] = hash1(form['message'], int(form['maxval']))
            form['result2'] = hash2(form['message'])
            return render(request, 'hash.html', {'form': form})
        else:
            form['error'] = 'Введены не все данные'
            return render(request, 'hash.html', {'form': form})
    else:
        return render(request, 'hash.html', {})







