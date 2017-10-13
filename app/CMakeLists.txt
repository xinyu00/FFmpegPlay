cmake_minimum_required(VERSION 3.4.1)


add_library(
             native-lib
             SHARED
             src/main/cpp/native-lib.cpp )

find_library(
              log-lib
              log )

set(distribution_DIR ${CMAKE_SOURCE_DIR}/../../../../libs)

add_library(
            ffmpeg
            SHARED
            IMPORTED )

set_target_properties(
            ffmpeg
            PROPERTIES IMPORTED_LOCATION
            ../../../../libs/armeabi/libffmpeg.so )

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=gnu++11")

include_directories(libs/include)

#target_include_directories(native-lib PRIVATE libs/include)

target_link_libraries( native-lib log android ffmpeg
                       ${log-lib} )