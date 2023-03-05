package ejedev.raidshamer;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;


@ConfigGroup("raidshamer")
public interface RaidShamerConfig extends Config
{

    @ConfigItem(
        keyName = "captureOwnDeaths",
        name = "Own Deaths Captured",
        description = "Allows you to toggle on/off own death shaming",
        position = 1
    )
    default boolean captureOwnDeaths()
    {
        return true;
    }

    @ConfigItem(
        keyName = "captureFriendDeaths",
        name = "Friend Deaths Captured",
        description = "Allows you to toggle on/off friend death shaming",
        position = 2
    )
    default boolean captureFriendDeaths()
    {
        return true;
    }

    @ConfigItem(
        keyName = "captureStrangerDeaths",
        name = "Stranger Deaths Captured",
        description = "Allows you to toggle on/off stranger death shaming",
        position = 3
    )
    default boolean captureStrangerDeaths()
    {
        return false;
    }

    @ConfigItem(
        keyName = "activeInCoX",
        name = "Active in Chambers of Xeric (CoX)",
        description = "Allows for shaming in CoX",
        position = 4
    )
    default boolean activeInCoX()
    {
        return true;
    }

    @ConfigItem(
        keyName = "activeInToB",
        name = "Active in Theater of Blood (ToB)",
        description = "Allows for shaming in ToB",
        position = 5
    )
    default boolean activeInToB()
    {
        return true;
    }

    @ConfigItem(
        keyName = "activeInToA",
        name = "Active in Tombs of Amascut (ToA)",
        description = "Allows for shaming in ToA",
        position = 6
    )
    default boolean activeInToA()
    {
        return true;
    }

    @ConfigItem(
        keyName = "activeElsewhere",
        name = "Active in other areas",
        description = "Allows for shaming outside of raids",
        position = 7
    )
    default boolean activeElsewhere()
    {
        return false;
    }

    @ConfigItem(
        keyName = "webhookEnabled",
        name = "Discord Webhook",
        description = "Allows you to send death photos automatically to a discord webhook. Read the github page for info.",
        position = 8
    )
    default boolean webhookEnabled()
    {
        return false;
    }

    @ConfigItem(
        keyName = "webhookLink",
        name = "Webhook URL",
        description = "Put your webhook link here, the full thing copied from discord.",
        position = 9
    )
    default String webhookLink()
    {
        return "";
    }
}

