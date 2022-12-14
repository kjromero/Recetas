package com.kenny.core.usecase

import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Single

abstract class ObservableUseCase<T, R : Any> {
    abstract fun execute(input: T): Observable<R>
}

abstract class SingleUseCase<T, R : Any> {
    abstract fun execute(input: T): Single<R>
}

abstract class CompletableUseCase<T> {
    abstract fun execute(input: T): Completable
}

abstract class UseCase<T, R> {
    abstract fun execute(input: T): R
}