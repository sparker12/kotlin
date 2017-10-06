/*
 * Copyright 2000-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.psi;

/*
 * Dummy interface for as23 to make imports intact
 */
public interface PsiJavaModule {
    String MODULE_INFO_CLASS = "module-info";
    String MODULE_INFO_FILE = MODULE_INFO_CLASS + ".java";
    String MODULE_INFO_CLS_FILE = MODULE_INFO_CLASS + ".class";
    String JAVA_BASE = "java.base";
}