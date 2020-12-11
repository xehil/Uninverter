/*
 * Copyright 2018 Phil Shadlyn
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.physphil.android.unitconverterultimate.api;

import com.physphil.android.unitconverterultimate.api.models.Envelope;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Retrofit service to consume Currency API
 */
public interface CurrencyService {
    @GET("eurofxref-daily.xml")
    Observable<Envelope> getLatestRates();
}
