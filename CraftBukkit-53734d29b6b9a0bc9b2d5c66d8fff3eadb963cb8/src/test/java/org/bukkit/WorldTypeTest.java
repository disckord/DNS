package org.bukkit;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import net.minecraft.server.v1_5_R3.WorldType;
import org.junit.Test;

public class WorldTypeTest {
    @Test
    public void testTypes() {
        for (WorldType type : WorldType.types) {
            if (type == null) continue;

            assertThat(type.name() + " has no Bukkit world", org.bukkit.WorldType.getByName(type.name()), is(not(nullValue())));
        }
    }
}
