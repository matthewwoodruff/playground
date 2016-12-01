var gulp = require('gulp');
var browserify = require('browserify');
var babelify = require('babelify');
var buffer = require('vinyl-buffer');
var uglify = require('gulp-uglify');
var gutil = require('gulp-util');
var sourcemaps = require('gulp-sourcemaps');
var source = require('vinyl-source-stream');

var buildJs = () => {
  return browserify('./index.js', {debug: true})
        .transform(babelify())
        .bundle()
        .pipe(source('main.js'))
        .pipe(buffer())
        // .pipe(sourcemaps.init({loadMaps: true}))
        // .pipe(uglify())
        .on('error', gutil.log)
        // .pipe(sourcemaps.write())
        .pipe(gulp.dest('./'));
}

gulp.task('default', buildJs);
