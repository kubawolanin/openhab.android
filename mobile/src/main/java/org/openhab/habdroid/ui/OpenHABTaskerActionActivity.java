/*
 * Copyright (c) 2010-2016, openHAB.org and others.
 *
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 */

package org.openhab.habdroid.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import org.openhab.habdroid.R;
import org.openhab.habdroid.model.OpenHABItem;

public final class OpenHABTaskerActionActivity extends OpenHABMainActivity
        implements OnItemSelectedListener, OnCommandChangeListener {

    private static final String STATE_ITEM_HREF = "itemHref";
    @Nullable
    private String command;
    private EditText commandEditText;
    private Button doneButton;
    @Nullable
    private Item item;
    private EditText itemEditText;
    private Items items;
    private ProgressView progressView;


}
