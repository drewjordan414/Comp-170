% Define the time vector
t = linspace(-8*pi, 8*pi, 1000);

% Create the square wave
s = square(t);

% Compute the frequency spectrum
freq = fft(s);

% Determine the cutoff index for lowpass filtering
% (for example, keep the first 10% of the frequency components)
cutoff = round(length(freq) * 0.1);

% Apply lowpass filter by zeroing out higher frequency components
freq(cutoff:end-cutoff+1) = 0;

% Convert back to the time domain
filt = real(ifft(freq));

% Plot the filtered signal
plot(t, filt);
title('Filtered Square Wave');
xlabel('Time');
ylabel('Amplitude');
