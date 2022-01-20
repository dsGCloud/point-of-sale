// Copyright 2021 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.abmedge.payments.util;

/** A checked exception that is thrown whenever there is a failure from the payment gateway */
public class PaymentProcessingFailedException extends Exception {

  private static final long serialVersionUID = 7718828512143293558L;

  public PaymentProcessingFailedException() {
    super();
  }

  public PaymentProcessingFailedException(String message, Throwable cause) {
    super(message, cause);
  }

  public PaymentProcessingFailedException(String message) {
    super(message);
  }

  public PaymentProcessingFailedException(Throwable cause) {
    super(cause);
  }
}
