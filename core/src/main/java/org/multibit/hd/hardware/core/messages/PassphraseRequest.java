package org.multibit.hd.hardware.core.messages;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * <p>
 * Value object to provide the following to downstream API consumers:</p>
 * <ul>
 * <li>Device requires passphrase to be displayed</li>
 * </ul>
 *
 * <p>
 * This object is typically built from a hardware wallet specific adapter</p>
 *
 * @since 0.8.0  
 */
public class PassphraseRequest implements HardwareWalletMessage {

    public PassphraseRequest() {
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).toString();
    }
}
