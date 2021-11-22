<!doctype html>
<html>
<body>

    <div>
        @foreach ($batches as $batch)
            <p>Batch ID:</p>
            <p>{{ $batch }}</p>
        @endforeach
    </div>

</body>
</html>
